const colorPicker1 = document.getElementById("colorPicker1");
const colorPicker2 = document.getElementById("colorPicker2");
const colorCode = document.getElementById("colorCode");
const resetButton = document.getElementById("resetButton");

function updateBackground() {
    const color1 = colorPicker1.value || '#ffffff';
    const color2 = colorPicker2.value || '#ffffff';
    document.body.style.background = `linear-gradient(45deg, ${color1}, ${color2})`;
    colorCode.textContent = `Primary: ${color1}, Secondary: ${color2}`;
}

colorPicker1.addEventListener('input', function () {
    updateBackground();
});

colorPicker2.addEventListener('input', function () {
    updateBackground();
});

colorCode.addEventListener('click', () => {
    navigator.clipboard.writeText(colorCode.textContent);
    alert("Color code copied: " + colorCode.textContent);
});

resetButton.addEventListener('click', () => {
    document.body.style.background = `linear-gradient(45deg, #ffffff, #ffffff)`;
    colorCode.textContent = '#ffffff';
    colorPicker1.value = '#ffffff';
    colorPicker2.value = '#ffffff';
});