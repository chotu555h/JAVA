function scrollToSection(id){
document.getElementById(id).scrollIntoView({behavior:'smooth'});
}


function openProject(page){
window.location.href = page;
}


document.getElementById('contactForm').addEventListener('submit', e => {
e.preventDefault();
alert('Message sent to backend!');
});